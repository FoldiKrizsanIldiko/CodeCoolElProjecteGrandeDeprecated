import { useState } from "react"
import { useNavigate } from "react-router-dom";

export default function Login() {
    const navigate = useNavigate();
    const [formData, setFormData] = useState({
        email: '',
        password: ''
    });
    const SendLoginData = async (event) => {
        event.preventDefault();
        
        try {
            const response = await fetch('https://localhost:7193/Auth/Login', 
        {
                method: 'POST',
                headers: 
                {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(formData)
            });

            if (response.ok) 
            {
               const data = await response.json();
               saveUserData_toLocalStorage(data);
               await getCartData(data.userId);
               navigate("/products")
            } 
        } catch (error) 
        {
            console.error('An error occurred:', error);
        }
    };

    const saveUserData_toLocalStorage = (data) => {
        //Decode token and get role for user
        const decodedToken = atob(data.token.split('.')[1]);
        const tokenData = JSON.parse(decodedToken);

        localStorage.setItem("role",tokenData[`http://schemas.xmlsoap.org/ws/2005/05/identity/claims/name`]);
        localStorage.setItem('token', data.token);
        localStorage.setItem('userName',data.userName);
        localStorage.setItem('userId',data.userId);
        localStorage.setItem('email',data.email);
    }
    const getCartData = async (userId) => {
        try {
            const resp = await fetch(`https://localhost:7193/cart?userId=${userId}`,
                {
                    method: 'GET',
                    headers: {
                        'Content-Type': 'application/json'
                    }
                });
            const cartData = await resp.json();

            if (cartData.length > 0)
            {
                localStorage.setItem('cartDetails', JSON.stringify(cartData));
            }
            
        } catch (error)
        {
            console.error('An error occurred:', error);
        }
    };
    
    const handleChange = (e) => {
        setFormData({
            ...formData,
            [e.target.name]: e.target.value
        });     
    };
    
    return (
      <section className="">
      <div className="flex flex-col items-center justify-center px-6 py-8 mx-auto md:h-screen lg:py-0">
          <div className="w-full bg-white rounded-lg shadow dark:border md:mt-0 sm:max-w-md xl:p-0 dark:bg-gray-800 dark:border-gray-700">
              <div className="p-6 space-y-4 md:space-y-6 sm:p-8">
                  <h1 className="text-xl font-bold leading-tight tracking-tight text-gray-900 md:text-2xl dark:text-white">
                      Log in to your account
                  </h1>
                  <form className="space-y-4 md:space-y-6" href="/products" onSubmit={SendLoginData}>
                        <div>
                            <label htmlFor="email" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Your email</label>
                            <input type="email" name="email" id="email" className="bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500" placeholder="name@company.com" required="" value={formData.email} onChange={handleChange}/>
                        </div>
                        
                        <div>
                            <label htmlFor="password" className="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Password</label>
                            <input type="password" name="password" id="password" placeholder="••••••••" className="bg-gray-50 border border-gray-300 text-gray-900 sm:text-sm rounded-lg focus:ring-primary-600 focus:border-primary-600 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500" required="" value={formData.password} onChange={handleChange}/>
                        </div>
                        <button id="login" type="submit" className="w-full text-white bg-blue-700 hover:bg-purple-800 focus:ring-4 focus:outline-none focus:ring-primary-300 font-medium rounded-lg text-sm px-5 py-2.5 text-center dark:bg-primary-600 dark:hover:bg-primary-700 dark:focus:ring-primary-800">Log in to your account</button>
                        <p className="text-sm font-light text-gray-500 dark:text-gray-400">
                            Don't have an account? <a href="/register" className="font-medium text-primary-600 hover:underline dark:text-primary-500">Register here</a>
                        </p>
                    </form>
              </div>
          </div>
      </div>
    </section>
    )
  }