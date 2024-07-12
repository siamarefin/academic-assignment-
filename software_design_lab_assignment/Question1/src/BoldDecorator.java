public class BoldDecorator extends TextRendererDecorator {
    public BoldDecorator(TextRenderer textRenderer) {
        super(textRenderer);
    }

    @Override
    public void render() {
        super.render();
        System.out.println("Adding bold formatting.");
    }
}
