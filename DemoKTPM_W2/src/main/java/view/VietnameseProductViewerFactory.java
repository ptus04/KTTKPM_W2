package view;

public class VietnameseProductViewerFactory implements IProductViewerFactory{
    @Override
    public IProductViewer createTextProductViewer() {
        return new VietnameseTextProductViewer();
    }

    @Override
    public IProductViewer createModernProductViewer() {
        return new VietnameseModernProductViewer();
    }
}
