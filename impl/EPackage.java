package practice.impl;

public enum EPackage {// перечисление
    PLASTIS("пластик"), CLASS("стекло");


    private final String material;

    EPackage(String material) {
        this.material = material;
    }

    public String getMaterial(){
        return material;
    }

}
