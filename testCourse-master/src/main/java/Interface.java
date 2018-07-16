public interface Interface {

    public void switchOnOff();

    default public void switchOnOffD(){
        System.out.println("я дефолтный метод интерфейса");
    }
}
