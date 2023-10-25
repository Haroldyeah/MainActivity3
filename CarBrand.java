class CarBrand {
    private String brandName;
    private int yearFounded;
    private String headquartersLocation;

    public CarBrand() {
    }

    public CarBrand(String brandName, int yearFounded, String headquartersLocation) {
        this.brandName = brandName;
        this.yearFounded = yearFounded;
        this.headquartersLocation = headquartersLocation;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getYearFounded() {
        return this.yearFounded;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public String getHeadquartersLocation() {
        return this.headquartersLocation;
    }

    public void setHeadquartersLocation(String headquartersLocation) {
        this.headquartersLocation = headquartersLocation;
    }

    @Override
    public String toString() {
        return "CarBrand{" +
                "brandName='" + brandName + '\'' +
                ", yearFounded=" + yearFounded +
                ", headquartersLocation='" + headquartersLocation + '\'' +
                '}';
    }
}