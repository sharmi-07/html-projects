alert("welcome");
function validate(event){
    event.preventDefault();
    EventCounts.onclick++;
    let name=document.getElementById("name").value.trim();
    if(name===""){
    alert("enter valid  name");
    return;
  }
  let phone = document.getElementsByClassName("phone")[0].value.trim();
    let p = /^\d{10}$/;
    if (!p.test(phone)) {
       document.getElementById("errorphone").innerText = "Enter valid phone number";
       return
    }
    let email=document.getElementById("email").value.trim();
    let e = /^[^@]+@gmail\.com$/;

    if(!e.test(email)){
        document.getElementById("erroremail").innerHTML="<span>enter the valid email</span>";
        return;
}
    let password=document.getElementById("password").value.trim();
    if(password.length<6){
        document.getElementById("errorpassword").innerText ="Password must be at least 6 characters";
        return; 
    }
}