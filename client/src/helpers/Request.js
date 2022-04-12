class Request {
  post(url, payload) {
    console.log(payload);
    return fetch("/api/guests", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(payload),
    });
  }

  postBooking(url, payload) {
    console.log("Posting!", payload);
    return fetch("/api/bookings", {
      method: "POST",
      headers: {"Content-Type": "application/json"},
      body: JSON.stringify(payload),
    });
  }

  patch(url, payload){
    return fetch(url, {
      method: "PATCH",
      headers: {'Content-Type': 'application/json'},
      body: JSON.stringify(payload)
  })
}

  delete(url, id) {
    return fetch(url + id, {
        method: 'DELETE'
    });
}
}

export default Request;
