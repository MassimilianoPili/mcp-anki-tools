package io.github.massimilianopili.mcp.anki;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Import;

@AutoConfiguration
@ConditionalOnProperty(name = "mcp.anki.enabled", havingValue = "true", matchIfMissing = false)
@Import({AnkiConfig.class, AnkiTools.class})
public class AnkiToolsAutoConfiguration {
}
