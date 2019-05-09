package khoapham.ptp.phamtanphat.intentdata;

import android.os.Parcel;
import android.os.Parcelable;

public class Animal implements Parcelable {
    String ten;

    public Animal(String ten) {
        this.ten = ten;
    }

    protected Animal(Parcel in) {
        ten = in.readString();
    }

    public static final Creator<Animal> CREATOR = new Creator<Animal>() {
        @Override
        public Animal createFromParcel(Parcel in) {
            return new Animal(in);
        }

        @Override
        public Animal[] newArray(int size) {
            return new Animal[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(ten);
    }
}
