public class testModuel {
    public static void main(String[] args) {
        ModuelA moduelA = new ModuelA();
        ModuleB moduleB = new ModuleB();
        moduleB.setModuelA(moduelA);
        System.out.println("测试用例:"+"str1:heyongkang\n"+"str2:heyongkang"+moduleB.operate("zhangruixiang","zhangruixiang"));
    }
}
