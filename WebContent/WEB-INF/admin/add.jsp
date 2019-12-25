<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN PAGE</title>
        
        <style>
           .container1{
				height:100%;
                width:100%;
                background:#A3E4D7;
				
            }
			.container{
				height:200px;
				width:100%;
				background:#45B39D;
			}
			.container h1{
				color:white;
                padding:30px;
                font-size:40px;
                margin-left:150px;
			}
            .form{
                height:100%;
                width:7000px;
				margin:auto;
                background:#A3E4D7;

            }
            .form h2{
                color:white;
                padding:10px;
                margin-left:550px;
				font-size:30px;
            }
            .form p{
                color:black;
                padding:8px;
                font-size:20px;
                margin-left:70px;
            }


			.button {
				background-color: #138D75;
				border: none;
				color: white;
			    padding: 15px 32px;
				text-align: center;
				text-decoration: none;
				display: inline-block;
			    font-size: 16px;
				margin-left:550px ;
                cursor: pointer;
            }

			
        </style>
    </head>
    <body>
        <div class="container1">
				<div class="container">
             <h1><b><i> SYNTEL <br/> &nbsp; &nbsp; Consider IT done</i></b></h1>
					</div>
              
 <div class="form">
		<h2> Add Employee</h2>
        
        <form method="post" name="login_form" action="Thankyou.html">
            <p>
                Employee Name &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                <input type="text" name="username">
               
            </p>

			  <p>
                Employee ID &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                <input type="text" name="username">
               
            </p>

			<p>
                Contact Number &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp;  &nbsp; 
                <input type="number" name="contact">
            </p>
            
            <p>
                Password &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                <input type="password" name="password">
               
            </p>

			<p>
                Confirm Password &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
                <input type="password" name="password">
               
            </p>

			<p>
                Salary &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                <input type="text" name="salary">
               
            </p>

			<p>
                Role &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                <select>
					<option value="select">Select</option>
					<option value="HR">HR</option>
					<option value="Employee">Employee</option>
				</select>               
            </p>
			
			

			<p>
                Secret Question &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp;  &nbsp;  &nbsp; 
                <select>
					<option value="select">Select</option>
					<option value="ques1">What was the name of your elementary / primary school?</option>
					<option value="ques2">In what city or town does your nearest sibling live?</option>
					<option value="ques3">What time of the day were you born? (hh:mm)</option>
					
				</select>               
            </p>

			<p>
                Secret Answer &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp;  &nbsp; 
                <input type="text" name="answer">
            </p>

            
			<h3>
           <button class="button">Add Employee</button>
           
			</h3>
        </form>
        <script src="javascript/login_validate.js"></script>
 </div>
      
              </div>
         
    </body>
</html>

