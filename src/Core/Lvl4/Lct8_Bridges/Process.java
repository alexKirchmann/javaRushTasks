package Core.Lvl4.Lct8_Bridges;

class Process {

    public static void main(String[] args) {
        SuspensionBridge sBridge = new SuspensionBridge();
        WaterBridge wBridge = new WaterBridge();

        println(sBridge);
        println(wBridge);
    }

    static void println(Bridge bridge){
        System.out.println(bridge.getCarsCount());
    }
}
