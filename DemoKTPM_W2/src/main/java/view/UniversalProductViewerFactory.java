package view;

public class UniversalProductViewerFactory implements IProductViewerFactory {
    public IProductViewer createTextProductViewer() {
        return new UniversalTextProductViewer();
    }

    public IProductViewer createModernProductViewer() {
        return new UniversalModernProductViewer();
    }
}
