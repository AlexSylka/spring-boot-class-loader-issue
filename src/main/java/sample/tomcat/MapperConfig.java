package sample.tomcat;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.Mapper;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class MapperConfig extends ConfigurableMapper implements ApplicationContextAware {

	private MapperFactory factory;
	private ApplicationContext applicationContext;

	public MapperConfig() {
		super(false);
	}

	@Override
	protected void configureFactoryBuilder(DefaultMapperFactory.Builder factoryBuilder) {
		factoryBuilder.mapNulls(false);
		// Tried to set different compilerStrategy but it doesn't helped
		//factoryBuilder.compilerStrategy(...);
	}

	@Override
	protected void configure(MapperFactory factory) {
		super.configure(factory);
		this.factory = factory;
		registerMappers();
		registerConverters();

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		super.init();
	}

	private void registerMappers() {
		Map<String, Mapper> mappers = applicationContext.getBeansOfType(Mapper.class);
		mappers.values().forEach(this::addMapper);
	}


	private void registerConverters() {
		Map<String, CustomConverter> converters = applicationContext.getBeansOfType(CustomConverter.class);
		converters.values().forEach(c -> factory.getConverterFactory().registerConverter(c));
	}

	private void addMapper(Mapper<?, ?> mapper) {
		factory.classMap(mapper.getAType(), mapper.getBType())
				.customize((Mapper) mapper)
				.byDefault()
				.register();
	}


}

