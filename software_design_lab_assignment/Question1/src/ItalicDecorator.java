public class ItalicDecorator extends TextRendererDecorator {
    public ItalicDecorator(TextRenderer textRenderer) {
        super(textRenderer);
    }

    @Override
    public void render() {
        super.render();
        System.out.println("Adding italic formatting.");
    }
}
