
   
import React from "react";

export default class FetchRandomUser extends React.Component {
  state = {
    loading: true,
    person: null
  };

  async componentDidMount() {
    const url = "http://localhost:8080/post";
    const response = await fetch(url);
    const data = await response.json();
    this.setState({ post: data.results[0], loading: false });
  }

  render() {
    if (this.state.loading) {
      return <div>loading...</div>;
    }

    if (!this.state.post) {
      return <div>didn't get a post</div>;
    }

    return (
      <div>
        <div>{this.state.post.id}</div>
        <div>{this.state.post.hub_id}</div>
        <div>{this.state.post.post_id}</div>
        
      </div>
    );
  }
}

