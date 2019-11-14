package todot.springframework.sfgpetclinic;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {
        ApplicationContext ctx=SpringApplication.run(SfgPetClinicApplication.class, args);
        String[] all = ctx.getBeanDefinitionNames();
        ConfigurableListableBeanFactory clbf = ((AbstractApplicationContext) ctx).getBeanFactory();
        for (String name : all) {
            Object s = clbf.getSingleton(name);
            if (s != null)
                System.out.println(s);
        }


    }

}
