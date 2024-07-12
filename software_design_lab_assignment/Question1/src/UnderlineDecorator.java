public class UnderlineDecorator extends TextRendererDecorator {
    public UnderlineDecorator(TextRenderer textRenderer) {
        super(textRenderer);
    }

    @Override
    public void render() {
        super.render();
        System.out.println("Adding underline formatting.");
    }
}
