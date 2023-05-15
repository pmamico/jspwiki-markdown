package hu.pmamico.jspwiki.plugin;

import java.util.Map;

import org.apache.wiki.WikiContext;
import org.apache.wiki.api.exceptions.PluginException;
import org.apache.wiki.api.plugin.WikiPlugin;
import org.apache.wiki.plugin.DefaultPluginManager;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;


public class MarkdownPlugin implements WikiPlugin {


	@Override
	public String execute(WikiContext wikiContext, Map<String, String> params) throws PluginException {
		String body = params.get(DefaultPluginManager.PARAM_BODY);

		if (body == null) {
			throw new PluginException("Markdown content is not provided!");
		}

		Parser parser = Parser.builder().build();
		Node document = parser.parse(body);

		HtmlRenderer renderer = HtmlRenderer.builder().build();
		return renderer.render(document);
	}





}