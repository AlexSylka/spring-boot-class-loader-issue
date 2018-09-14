package sample.tomcat;


import ma.glasnost.orika.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import sample.tomcat.models.SettingsDto;
import sample.tomcat.models.SettingsModel;

@Controller
public class TestController {

    @Autowired
    private final MapperFacade mapper;

    public TestController(MapperFacade mapper) {
        this.mapper = mapper;
    }

    @GetMapping("/test-mapping")
    @ResponseStatus(HttpStatus.OK)
    public void test() {
        SettingsDto settingsDto = new SettingsDto();
        SettingsModel model = mapper.map(settingsDto, SettingsModel.class);
    }

}
