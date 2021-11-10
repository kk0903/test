public class ModuleB {
    private ModuelA moduelA;

    public void setModuelA(ModuelA moduelA){
        this.moduelA = moduelA;
    }

    public String operate(String str1,String str2){
        return moduelA.operate(str1,str2);
    }
}
