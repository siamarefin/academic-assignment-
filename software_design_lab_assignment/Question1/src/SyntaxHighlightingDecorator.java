public class SyntaxHighlightingDecorator extends TextRendererDecorator {
    public SyntaxHighlightingDecorator(TextRenderer textRenderer) {
        super(textRenderer);
    }

    @Override
    public void render() {
        super.render();
        System.out.println("Adding syntax highlighting.");
    }
}
