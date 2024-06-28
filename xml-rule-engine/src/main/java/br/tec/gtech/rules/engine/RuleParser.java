package br.tec.gtech.rules.engine;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.slf4j.LoggerFactory;
import java.io.InputStream;
import org.slf4j.Logger;

public final class RuleParser {
    private static final Logger logger = LoggerFactory.getLogger(RuleParser.class);

    private RuleParser() {
        
    }

    public static Rules parseRules(String filePath) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Rules.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            InputStream is = RuleParser.class.getClassLoader().getResourceAsStream(filePath);
            return (Rules) unmarshaller.unmarshal(is);
        } catch (JAXBException e) {
            logger.error("Error parsing rules file: " + e.getMessage(), e);
            return null;
        }
    }
}
