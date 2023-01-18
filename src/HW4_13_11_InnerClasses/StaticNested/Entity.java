package HW4_13_11_InnerClasses.StaticNested;

class Entity {
    private static int count = 0;

    public Entity() {
        new Counter().setCount();
    }

    public static int getCount() {
        return count;
    }

    private static class Counter {
        private void setCount() {
            count = count + 1;
        }
    }
}
