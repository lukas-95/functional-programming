const hello = (firstName, lastName, callback) => {
    console.log(firstName);
    if (lastName){
        console.log(lastName);
    } else {
        callback(firstName);
    }

}

const cb = ( firstName) => {
    console.log(firstName + " tell us your lastName")
}

hello('Lucas', null, cb)

["foo", 'bar'].map((v, index)=>{
    console.log(v)
})