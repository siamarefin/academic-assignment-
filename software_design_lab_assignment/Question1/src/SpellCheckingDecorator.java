public class SpellCheckingDecorator extends TextRendererDecorator {
    public SpellCheckingDecorator(TextRenderer textRenderer) {
        super(textRenderer);
    }

    @Override
    public void render() {
        super.render();
        System.out.println("Adding spell checking.");
    }
}
