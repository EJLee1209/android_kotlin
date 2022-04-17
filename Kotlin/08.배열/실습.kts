var array1 = arrayOf<Int>(1,2,3,4,5)
var array2 = arrayOf(true, "HI", 10, 2.2, null)

for(i in array2){
    println(i)
}

var array3 = Array<Int>(10, {0})
var array4 = Array<String>(10, {""})

for(i in array3){
    print(i)
}
println("")
