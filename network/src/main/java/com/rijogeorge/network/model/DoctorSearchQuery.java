package com.rijogeorge.network.model;

public class DoctorSearchQuery {
    public enum Gender{MALE, FEMALE};
    public enum Sort{DESTANCE_ASC, DESTANCE_DESC};

    private String name;
    private String first_name;
    private String last_name;
    private String query;
    private String specialty_uid;
    private String insurance_uid;
    private String practice_uid;
    private String location;
    private String user_location;
    private Gender gender;
    private Sort sort;
    private int skip;
    private int limit;

    public String getName() {
        return name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getQuery() {
        return query;
    }

    public String getSpecialty_uid() {
        return specialty_uid;
    }

    public String getInsurance_uid() {
        return insurance_uid;
    }

    public String getPractice_uid() {
        return practice_uid;
    }

    public String getLocation() {
        return location;
    }

    public String getUser_location() {
        return user_location;
    }

    public Gender getGender() {
        return gender;
    }

    public String getGenderString() {
        return gender.toString();
    }

    public Sort getSort() {
        return sort;
    }

    public String getSortString() {
        return sort.toString();
    }

    public int getSkip() {
        return skip;
    }

    public int getLimit() {
        return limit;
    }

    public static class Builder {
        //required parameter
        private final String location;
        //optional parameters
        private String name;
        private String first_name;
        private String last_name;
        private String query;
        private String specialty_uid;
        private String insurance_uid;
        private String practice_uid;
        private String user_location;
        private Gender gender;
        private Sort sort;
        private int skip;
        private int limit;


        public Builder(String location) {
            this.location = location;
        }

        public Builder Name(String name) {
            this.name = name;
            return this;
        }

        public Builder First_name(String first_name) {
            this.first_name = first_name;
            return this;
        }

        public Builder Last_name(String last_name) {
            this.last_name = last_name;
            return this;
        }

        public Builder Query(String query) {
            this.query = query;
            return this;
        }

        public Builder Specialty_uid(String specialty_uid) {
            this.specialty_uid = specialty_uid;
            return this;
        }

        public Builder Insurance_uid(String insurance_uid) {
            this.insurance_uid = insurance_uid;
            return this;
        }

        public Builder Practice_uid(String practice_uid) {
            this.practice_uid = practice_uid;
            return this;
        }

        public Builder User_location(String user_location) {
            this.user_location = user_location;
            return this;
        }

        public Builder Gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder Sort(Sort sort) {
            this.sort = sort;
            return this;
        }

        public Builder Skip(int skip) {
            this.skip = skip;
            return this;
        }

        public Builder Limit(int limit) {
            this.limit = limit;
            return this;
        }

        public DoctorSearchQuery build() {
            return new DoctorSearchQuery(this);
        }
    }

    private DoctorSearchQuery(Builder builder) {
        name = builder.name;
        first_name = builder.first_name;
        last_name = builder.last_name;
        query = builder.query;
        specialty_uid = builder.specialty_uid;
        insurance_uid = builder.insurance_uid;
        practice_uid = builder.practice_uid;
        location = builder.location;
        user_location = builder.user_location;
        gender = builder.gender;
        sort = builder.sort;
        skip = builder.skip;
        limit = builder.limit;
    }
}

