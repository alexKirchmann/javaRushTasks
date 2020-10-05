package Core.Lvl6.Lct13_FactoryMethodPattern;

class   ImageReaderFactory {
    static ImageReader getImageReader (ImageTypes type) {
        switch (type) {
            case BMP: return new BmpReader();
            case JPG: return new JpgReader();
            case PNG: return new PngReader();
            default: throw new IllegalArgumentException ("UNKNOWN IMAGE TYPE");
        }
    }
}
