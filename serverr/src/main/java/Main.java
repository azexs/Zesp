import io.javalin.Javalin;

public class Main {

    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        app.get("/add", ctx -> {
            String a = ctx.queryParam("a");
            String b = ctx.queryParam("b");
            try {
                Float addResult = Float.parseFloat(a)+Float.parseFloat(b);
                ctx.status(200);
                ctx.result(Float.toString(addResult));
            } catch (Exception e){
                ctx.status(400);
                ctx.result(a + " or " + b + " is not a number");
            }


        });
    }

}
