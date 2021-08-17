package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {
        logger.debug("Guess The Number Game");

        /** Create context (container) */
        ConfigurableApplicationContext context
                = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        /** Get number generator bean from context (container) */
        NumberGenerator numberGenerator =
                context.getBean("numberGenerator", NumberGenerator.class);

        /** Call method next() to get a random number */
        int number = numberGenerator.next();

        /** Log generated number */
        logger.info("Number = {} ", number);

        /** Get game bean from context (container) */
        Game game = context.getBean(Game.class);

        /** Close context (container) */
        context.close();
    }
}
