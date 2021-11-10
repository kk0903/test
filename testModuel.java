public class testModuel {
    public static void main(String[] args) {
        ModuelA moduelA = new ModuelA();
        ModuleB moduleB = new ModuleB();
        moduleB.setModuelA(moduelA);
        System.out.println("计科182");
        System.out.println("测试一："+moduleB.operate("45","454545"));
        System.out.println("测试结果："+moduleB.operate("lizitian","lizitian"));
    }
}
