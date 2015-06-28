package demo 

import org.json.JSONObject
import java.util.Map
import kotlin.test.assertEquals
import org.junit.Test as test

class TestJavaConstructor {
    test fun f() {
        val javaMap = java.util.HashMap<String, Object>()
        javaMap.put("hello", "world" as java.lang.Object)
        val jsonObject = JSONObject(javaMap as Map<String, Object>)
        assertEquals("{\"hello\":\"world\"}", jsonObject.toString())
    }
}
