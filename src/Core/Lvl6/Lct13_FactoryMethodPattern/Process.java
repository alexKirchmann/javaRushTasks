package Core.Lvl6.Lct13_FactoryMethodPattern;

class Process {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
    }
}
