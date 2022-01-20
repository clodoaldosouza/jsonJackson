package br.com.clodoaldo.souza.json.decoder.app;

import br.com.clodoaldo.souza.json.decoder.di.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.startApplication();
    }

    private void startApplication() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        ApplicationService appService = context.getBean(ApplicationService.class);
        appService.start();
    }
}
