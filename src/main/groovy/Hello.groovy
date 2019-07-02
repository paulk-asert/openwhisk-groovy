import com.google.gson.JsonObject

static JsonObject main(JsonObject args) {
    new JsonObject().tap{ addProperty('message', "${args.name.asString} Rocks on OpenWhisk!") }
}
