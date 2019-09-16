function main()
var n = Number(prompt("How many times do you want to flip the coin?")); //Gets the number of times coin flip is required
var heads = 0, tails = 0; //initialized heads and tails
for(var i=0;i<n;i++)
{
    if(Math.random() < 0.50)
    {
        heads++;
    }
    else
    {
        tails++;
    }
    document.getElementById("coinCount").innerHTML = "<table>"+"<th>Heads</th><th>Tails</th><tr>"+"<td>"+heads+"</td><td>"+tails+"</td></tr>"+"</table>";
    
}