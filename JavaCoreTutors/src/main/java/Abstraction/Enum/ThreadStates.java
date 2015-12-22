package Abstraction.Enum;

/**
 * Created by O1e6 <NsN> on 12/13/2015.
 */
public enum ThreadStates {
    START {
        @Override
        public void getField() {

        }
    },
    RUNNING {
        @Override
        public void getField() {

        }
    },
    WAITING {
        @Override
        public void getField() {

        }
    },
    DEAD {
        @Override
        public void getField() {

        }
    };

    public abstract void getField(); // must be implemented inside to all fields
}
