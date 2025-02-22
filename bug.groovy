```groovy
def someMethod(List<String> list) {
    list.eachWithIndex { String item, int index ->
        if (item == "someValue") {
            println "Found at index: $index"
            // Some code here that uses 'index'
            return //This return statement will return from eachWithIndex closure, not the method
        }
    }
}

//Incorrect assumption: The method will return when "someValue" is found
someMethod(['a', 'b', 'someValue', 'c'])
println "This will always execute"
```