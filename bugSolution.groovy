```groovy
def someMethod(List<String> list) {
    boolean found = false
    for (int i = 0; i < list.size(); i++) {
        if (list[i] == "someValue") {
            println "Found at index: $i"
            // Some code here that uses 'i'
            found = true
            break
        }
    }
    if(!found) {
        println "Not found"
    }
}

someMethod(['a', 'b', 'someValue', 'c'])
println "This will execute only if someValue is not found"

// Alternative using findIndexOf

def someMethod2(List<String> list) {
    int index = list.findIndexOf { it == "someValue" }
    if (index != -1) {
        println "Found at index: $index"
        //Some code here
    } else {
        println "Not found"
    }
}
someMethod2(['a', 'b', 'c'])
println "This will execute"
```