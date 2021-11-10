public class testModuel {
    public static void main(String[] args) {
        ModuelA moduelA = new ModuelA();
        ModuleB moduleB = new ModuleB();
        moduleB.setModuelA(moduelA);
        System.out.println(moduelA.operate("11","11111"));
        System.out.println(moduleB.operate("11","11111"));
    }
}
