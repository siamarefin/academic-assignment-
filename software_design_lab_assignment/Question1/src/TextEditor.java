public class TextEditor {
    public static void main(String[] args) {
        TextRenderer renderer = new BasicTextRenderer();
        renderer = new BoldDecorator(renderer);
        renderer = new ItalicDecorator(renderer);
        renderer = new SyntaxHighlightingDecorator(renderer);
        renderer = new SpellCheckingDecorator(renderer);

        renderer.render();  // This will render the text with all the added functionalities
    }
}
