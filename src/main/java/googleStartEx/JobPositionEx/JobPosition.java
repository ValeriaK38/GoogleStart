package googleStartEx.JobPositionEx;

import java.time.LocalDateTime;

public class JobPosition {
    private final LocalDateTime publishedDate;
    private final String title;
    private String description;
    private Location location;
    private double salaryCap;
    private final Boolean isRemote;
    private int yearsOfExperienceRequired;


    public static class Builder{
        private final LocalDateTime publishedDate;
        private final String title;
        private final Boolean isRemote;

        private Location location = Location.TEL_AVIV;
        private String description = "hard work ...";
        private double salaryCap = 700000.0;
        private int yearsOfExperienceRequired = 3 ;


        public Builder(LocalDateTime publishedDate,String title, Boolean isRemote){
            this.publishedDate = publishedDate;
            this.title = title;
            this.isRemote = isRemote;
        }
        public Builder description(String description){
            this.description = description;
            return this;
        }
        public Builder location(Location location){
            this.location = location;
            return this;
        }
        public Builder salaryCap(Double salaryCap){
            this.salaryCap = salaryCap;
            return this;
        }
        public Builder yearsOfExperienceRequired(int yearsOfExperienceRequired){
            this.yearsOfExperienceRequired = yearsOfExperienceRequired;
            return this;
        }

        public JobPosition build(){
            return new JobPosition(this);
        }
    }
    private JobPosition(Builder builder){
        this.publishedDate = builder.publishedDate;
        this.title = builder.title;
        this.isRemote = builder.isRemote;
        this.yearsOfExperienceRequired = builder.yearsOfExperienceRequired;
        this.salaryCap = builder.salaryCap;
        this.location = builder.location;
        this.description = builder.description;
    }
}
