//Armstrong Number
fun main() {
    val n=153
    var num=n
    var q=0
    var t=0
    var s=0
    
    while(num!=0){
        t=num%10
        s=t*t*t
        q = q + s
        num=num/10
    }
    if(q == n){
    	println("$q is Armstrong")    
    }
    else{
        println("$q is Not Armstrong")
    }    
}
