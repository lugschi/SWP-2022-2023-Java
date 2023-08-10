using System;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json;

class Program
{
    static async Task Main(string[] args)
    {
        // Get Request
        string apiUrl = "http://139.162.181.209/api/shorten/luca";
        int counter = 2000;
        int delay = 60000 / counter;
        int successCounter = 0;
        int failedCounter = 0;
        using (HttpClient httpClient = new HttpClient())
        {
            HashSet<string> uniqueStatusCodes = new HashSet<string>();
            for (int i = 0; i < counter; i++)
            {
                HttpResponseMessage response = await httpClient.GetAsync(apiUrl);
                string statusCodeString = response.StatusCode.ToString();

                if (response.IsSuccessStatusCode)
                {
                    string responseBody = await response.Content.ReadAsStringAsync();
                    Console.WriteLine($"Anfrage {i + 1} erfolgreich. Response Body: {responseBody}");
                    successCounter++;
                }
                else
                {
                    Console.WriteLine($"Anfrage {i + 1} nicht erfolgreich. Statuscode: {response.StatusCode}");
                    failedCounter++;
                }
                if (!uniqueStatusCodes.Contains(statusCodeString))
                {
                    uniqueStatusCodes.Add(statusCodeString);
                }

                await Task.Delay(delay);
            }
            Console.WriteLine($"Erfolgreiche Anfragen: {successCounter}");
            Console.WriteLine($"Fehlgeschlagene Anfragen: {failedCounter}");
            Console.WriteLine("Error Code: ");
            foreach (string statusCode in uniqueStatusCodes)
            {
                Console.WriteLine(statusCode);
            }
        }
    }
}


// Pos request

/*
        int counter = 10;
        int delay = 60000 / counter;

        using var httpClient = new HttpClient();

        for (int i = 1; i <= counter; i++)
        {
            try
            {
                string apiUrl = "http://139.162.181.209/api/shorten";

                var requestData = new
                {
                    longURL = "dev.to",
                    customURL = "http://139.162.181.209/testasdf1" + i,
                    shortURL = "http://139.162.181.209/testasdf1" + i,
                };

                // Stop thread for the delay time
                // Thread.Sleep(delay);

                string requestBody = JsonConvert.SerializeObject(requestData);

                System.Console.WriteLine(requestBody);

                var content = new StringContent(requestBody, Encoding.UTF8, "application/json");

                HttpResponseMessage response = await httpClient.PostAsync(apiUrl, content);

                if (!response.IsSuccessStatusCode)
                {
                    string responseContent = await response.Content.ReadAsStringAsync();
                    System.Console.WriteLine($"Error reached: at request NR: {i}");
                }
                else
                {
                    System.Console.WriteLine($"POST Request NR: {i} was successfully");
                }
            }
            catch (HttpRequestException e)
            {
                Console.WriteLine($"Request error: {e.Message}");
            }
        }*/