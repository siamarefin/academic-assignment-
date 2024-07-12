public abstract class TextRendererDecorator implements TextRenderer {
    protected TextRenderer decoratedTextRenderer;

    public TextRendererDecorator(TextRenderer textRenderer) {
        this.decoratedTextRenderer = textRenderer;
    }

    @Override
    public void render() {
        decoratedTextRenderer.render();
    }
}
