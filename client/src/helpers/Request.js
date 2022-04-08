class Request {
  post(url, payload) {
    console.log(payload);
    return fetch("/api/guests", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(payload),
    });
  }
}

export default Request;
