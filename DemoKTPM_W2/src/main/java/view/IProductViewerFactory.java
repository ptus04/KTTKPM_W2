package view;

public interface IProductViewerFactory {
    IProductViewer createTextProductViewer();
    IProductViewer createModernProductViewer();
}
