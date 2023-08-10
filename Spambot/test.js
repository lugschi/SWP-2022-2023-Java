const postReq = async () => {
    for (let i = 0; i < 100; i++) {
        let requestData =
        {
            longUrl: "dev.to",
            customUrl: "http://139.162.181.209/testasfdas1" + i,
            shortUrl: "http://139.162.181.209/testasfdas1" + i,
        };

        const response = await fetch("http://139.162.181.209/api/shorten", {
            method: "POST",
            body: JSON.stringify(requestData)

        })

        console.log(await response.status)
    }
}

