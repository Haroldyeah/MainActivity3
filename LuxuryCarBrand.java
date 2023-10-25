class LuxuryCarBrand extends CarBrand {
    private boolean isLuxury;

    public LuxuryCarBrand(String brandName, int yearFounded, String headquartersLocation, boolean isLuxury) {
        super(brandName, yearFounded, headquartersLocation);
        this.isLuxury = isLuxury;
    }

    public boolean isLuxury() {
        return isLuxury;
    }

    public void setLuxury(boolean luxury) {
        isLuxury = luxury;
    }

    @Override
    public String toString() {
        return "LuxuryCarBrand{" +
                "brandName='" + getBrandName() + '\'' +
                ", yearFounded=" + getYearFounded() +
                ", headquartersLocation='" + getHeadquartersLocation() + '\'' +
                ", isLuxury=" + isLuxury +
                '}';
    }
}