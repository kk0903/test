public class testModuel {
    public static void main(String[] args) {
        ModuelA moduelA = new ModuelA();
        ModuleB moduleB = new ModuleB();
        moduleB.setModuelA(moduelA);
        System.out.println("测试一："+moduleB.operate("12","12345"));
        System.out.println("测试二："+moduleB.operate(" zhuoyipeng"," zhuoyipeng"));
    }
}
