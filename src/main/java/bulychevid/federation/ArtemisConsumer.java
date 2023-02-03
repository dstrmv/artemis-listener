package bulychevid.federation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ArtemisConsumer {

    private static Logger log = LoggerFactory.getLogger(ArtemisConsumer.class);

    @JmsListener(destination = "test-branch-office-updates")
    public void processMessage(String content) {
        log.info(content);
    }

}
