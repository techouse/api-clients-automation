//
// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.
//

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using Algolia.Search.Models;

namespace Algolia.Search.Ingestion.Models
{
  /// <summary>
  /// The payload for a task update.
  /// </summary>
  [DataContract(Name = "TaskUpdate")]
  public partial class TaskUpdate : IEquatable<TaskUpdate>
  {
    /// <summary>
    /// Initializes a new instance of the <see cref="TaskUpdate" /> class.
    /// </summary>
    /// <param name="destinationID">The destination UUID..</param>
    /// <param name="trigger">trigger.</param>
    /// <param name="input">input.</param>
    /// <param name="enabled">Whether the task is enabled or not..</param>
    /// <param name="failureThreshold">A percentage representing the accepted failure threshold to determine if a &#x60;run&#x60; succeeded or not..</param>
    public TaskUpdate(string destinationID = default(string), TriggerUpdateInput trigger = default(TriggerUpdateInput), TaskInput input = default(TaskInput), bool enabled = default(bool), int failureThreshold = default(int))
    {
      this.DestinationID = destinationID;
      this.Trigger = trigger;
      this.Input = input;
      this.Enabled = enabled;
      this.FailureThreshold = failureThreshold;
    }

    /// <summary>
    /// The destination UUID.
    /// </summary>
    /// <value>The destination UUID.</value>
    [DataMember(Name = "destinationID", EmitDefaultValue = false)]
    public string DestinationID { get; set; }

    /// <summary>
    /// Gets or Sets Trigger
    /// </summary>
    [DataMember(Name = "trigger", EmitDefaultValue = false)]
    public TriggerUpdateInput Trigger { get; set; }

    /// <summary>
    /// Gets or Sets Input
    /// </summary>
    [DataMember(Name = "input", EmitDefaultValue = false)]
    public TaskInput Input { get; set; }

    /// <summary>
    /// Whether the task is enabled or not.
    /// </summary>
    /// <value>Whether the task is enabled or not.</value>
    [DataMember(Name = "enabled", EmitDefaultValue = true)]
    public bool Enabled { get; set; }

    /// <summary>
    /// A percentage representing the accepted failure threshold to determine if a &#x60;run&#x60; succeeded or not.
    /// </summary>
    /// <value>A percentage representing the accepted failure threshold to determine if a &#x60;run&#x60; succeeded or not.</value>
    [DataMember(Name = "failureThreshold", EmitDefaultValue = false)]
    public int FailureThreshold { get; set; }

    /// <summary>
    /// Returns the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()
    {
      StringBuilder sb = new StringBuilder();
      sb.Append("class TaskUpdate {\n");
      sb.Append("  DestinationID: ").Append(DestinationID).Append("\n");
      sb.Append("  Trigger: ").Append(Trigger).Append("\n");
      sb.Append("  Input: ").Append(Input).Append("\n");
      sb.Append("  Enabled: ").Append(Enabled).Append("\n");
      sb.Append("  FailureThreshold: ").Append(FailureThreshold).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Returns the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public virtual string ToJson()
    {
      return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
    }

    /// <summary>
    /// Returns true if objects are equal
    /// </summary>
    /// <param name="input">Object to be compared</param>
    /// <returns>Boolean</returns>
    public override bool Equals(object input)
    {
      return this.Equals(input as TaskUpdate);
    }

    /// <summary>
    /// Returns true if TaskUpdate instances are equal
    /// </summary>
    /// <param name="input">Instance of TaskUpdate to be compared</param>
    /// <returns>Boolean</returns>
    public bool Equals(TaskUpdate input)
    {
      if (input == null)
      {
        return false;
      }
      return
          (
              this.DestinationID == input.DestinationID ||
              (this.DestinationID != null &&
              this.DestinationID.Equals(input.DestinationID))
          ) &&
          (
              this.Trigger == input.Trigger ||
              (this.Trigger != null &&
              this.Trigger.Equals(input.Trigger))
          ) &&
          (
              this.Input == input.Input ||
              (this.Input != null &&
              this.Input.Equals(input.Input))
          ) &&
          (
              this.Enabled == input.Enabled ||
              this.Enabled.Equals(input.Enabled)
          ) &&
          (
              this.FailureThreshold == input.FailureThreshold ||
              this.FailureThreshold.Equals(input.FailureThreshold)
          );
    }

    /// <summary>
    /// Gets the hash code
    /// </summary>
    /// <returns>Hash code</returns>
    public override int GetHashCode()
    {
      unchecked // Overflow is fine, just wrap
      {
        int hashCode = 41;
        if (this.DestinationID != null)
        {
          hashCode = (hashCode * 59) + this.DestinationID.GetHashCode();
        }
        if (this.Trigger != null)
        {
          hashCode = (hashCode * 59) + this.Trigger.GetHashCode();
        }
        if (this.Input != null)
        {
          hashCode = (hashCode * 59) + this.Input.GetHashCode();
        }
        hashCode = (hashCode * 59) + this.Enabled.GetHashCode();
        hashCode = (hashCode * 59) + this.FailureThreshold.GetHashCode();
        return hashCode;
      }
    }

  }

}
