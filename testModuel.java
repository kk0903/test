public class testModuel {
    public static void main(String[] args) {
        ModuelA moduelA = new ModuelA();
        ModuleB moduleB = new ModuleB();
        moduleB.setModuelA(moduelA);
        System.out.println("陈金汉测试用例：");
        System.out.println(moduleB.operate("824","824445"));
    }
}
